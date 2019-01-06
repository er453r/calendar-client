import com.er453r.calendars.external.ace
import jspdf.jsPDF
import kotlinx.coroutines.*
import org.w3c.dom.*
import kotlin.browser.document

fun main() {
    console.log("Calendars start")

    document.addEventListener("DOMContentLoaded", {
//        val header = document.createElement("h2") as HTMLHeadingElement
//        val preview = document.getElementById("preview") as HTMLIFrameElement
//
//        val editor = ace.edit("editor")
//
//        var job: Job? = null
//
//        val html = "<html><body><h1>HELLO FROM HTML!!!</h1></body></html>"
//
//        editor.getSession().setValue(html)
//
//        editor.getSession().on("change") {
//            job?.let {
//                if (it.isActive)
//                    it.cancel()
//            }
//
//            job = GlobalScope.launch {
//                delay(1000)
//
//                console.log("updating pdf...")
//
//                val pdf = jsPDF(
//                        orientation = "landscape",
//                        unit = "cm",
//                        format = "a4"
//                )
//
//                pdf.fromHTML(editor.getSession().getValue(), 0, 0)
//
//                preview.src = pdf.output("bloburi") as String
//            }
//        }
//
//        header.innerHTML = "Create your own calendar!"
//
//        document.body?.appendChild(header)

        val total = 7 * 54

        val width = 7
        val height = total / width

        val table = document.createElement("table") as HTMLTableElement

        document.body?.appendChild(table)


        for(y in 0 until height) {
            val row = document.createElement("tr") as HTMLTableRowElement

            for (x in 0 until width) {
                val cell = document.createElement("td") as HTMLTableCellElement

                cell.innerHTML = "$y / $x"

                row.appendChild(cell)
            }

            table.appendChild(row)
        }

    })
}
