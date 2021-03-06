//import com.er453r.calendars.external.ace
//import jspdf.jsPDF
//import kotlinx.coroutines.*
//import org.w3c.dom.*
import com.er453r.calendars.ChainCalendar
import org.w3c.dom.HTMLHeadingElement
import kotlin.browser.document
import kotlin.math.floor

//import kotlin.js.Date

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
        pageStats("A4 Portrait", 210, 297)
        pageStats("A4 Landscape", 297, 210)

        for(year in 2019..2019){
            val header = document.createElement("h2") as HTMLHeadingElement

            header.innerHTML = year.toString()
            header.classList.add("yearTitle")

            //document.body?.appendChild(header)

            val calendar = ChainCalendar(year, 3)

            document.body?.appendChild(calendar.table())
        }
    })
}

fun pageStats(label:String, width:Int, height:Int){
    println("$label - page stats for ${width}x$height")

    val weeksMax = 54
    val daysMax = weeksMax * 7

    for(n in 1..10){
        val boxesHorizontal = n * 7
        val boxSize = width.toFloat() / boxesHorizontal
        val boxesVertical = floor(height.toFloat() / boxSize)

        val boxesTotal = boxesHorizontal * boxesVertical

        val boxesPerDay = floor(boxesTotal / daysMax)

        val spaceLeft = height - boxSize * boxesVertical

        println("For size ${boxesHorizontal}x$boxesVertical it is total of $boxesTotal boxes, $boxesPerDay per day, of size ${boxSize}x$boxSize mm., $spaceLeft mm. space left")
    }
}
