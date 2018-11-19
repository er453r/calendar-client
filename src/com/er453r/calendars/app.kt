import com.er453r.calendars.external.ace
import jspdf.jsPDF
import kotlinx.coroutines.*
import org.w3c.dom.HTMLHeadingElement
import org.w3c.dom.HTMLIFrameElement
import kotlin.browser.document

fun main() {
    console.log("Calendars start")

    document.addEventListener("DOMContentLoaded", {
        val header = document.createElement("h2") as HTMLHeadingElement
        val preview = document.getElementById("preview") as HTMLIFrameElement

        val editor = ace.edit("editor")

        var job: Job? = null

        val html = "<html><body><h1>HELLO FROM HTML!!!</h1></body></html>"

        editor.getSession().setValue(html)

        editor.getSession().on("change") {
            job?.let {
                if (it.isActive)
                    it.cancel()
            }

            job = GlobalScope.launch {
                delay(1000)

                console.log("updating pdf...")

                val pdf = jsPDF(
                        orientation = "landscape",
                        unit = "cm",
                        format = "a4"
                )

                pdf.fromHTML(editor.getSession().getValue(), 0, 0)

                preview.src = pdf.output("bloburi") as String
            }
        }

        header.innerHTML = "Create your own calendar!"

        document.body?.appendChild(header)
    })
}