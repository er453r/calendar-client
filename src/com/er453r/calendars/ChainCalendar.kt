package com.er453r.calendars

import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLTableCellElement
import org.w3c.dom.HTMLTableElement
import org.w3c.dom.HTMLTableRowElement
import kotlin.browser.document
import kotlin.js.Date

enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class ChainCalendar(val year: Int) {
    fun table():HTMLTableElement{
        val total = 7 * 54

        val width = 3 * 7
        val height = total / width

        val table = document.createElement("table") as HTMLTableElement

        var dayOfTheYear = 1

        val firstDayOfTheYear = Date(year, 0, 1, 1, 1, 1)

        val rowStartDay = Day.MONDAY
        val yearStartDay:Day = firstDayOfTheYear.day

        var date = Date(firstDayOfTheYear.getTime() - (((yearStartDay.ordinal - rowStartDay.ordinal) % 6) * 24 * 60 * 60 * 1000))

        for(y in 0 until height) {
            val row = document.createElement("tr") as HTMLTableRowElement

            for (x in 0 until width) {
                val cell = document.createElement("td") as HTMLTableCellElement
                val content = document.createElement("div") as HTMLDivElement

                if(date.getDate() == 1){
                    content.innerHTML = "<h2>${date.getMonth()+1}</h2>"
                }

                content.innerHTML += "${date.getDate()}"

                cell.appendChild(content)

                if(date.getFullYear() != year)
                    cell.classList.add("wrongYear")

                cell.classList.add(date.day.toString().toLowerCase())

                if(date.getDate() == 1)
                    cell.classList.add("monthStart")

                row.appendChild(cell)

                date = date.nextDay()
            }

            table.appendChild(row)
        }

        return table
    }
}

val Date.day : Day
    get() = Day.values()[this.getDay()]

fun Date.nextDay() = Date(this.getTime() + 24 * 60 * 60 * 1000)
