package com.er453r.calendars

import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLTableCellElement
import org.w3c.dom.HTMLTableElement
import org.w3c.dom.HTMLTableRowElement
import kotlin.browser.document
import kotlin.js.Date
import kotlin.math.ceil

enum class Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class ChainCalendar(private val year: Int, private val boxesPerDay:Int) {
    fun table():HTMLTableElement{
        val total = 7 * 54

        val width = 4 * 7
        val height = ceil(total.toFloat() / width).toInt()

        val table = document.createElement("table") as HTMLTableElement

        val firstDayOfTheYear = Date(year, 0, 1, 1, 1, 1)

        val rowStartDay = Day.MONDAY
        val yearStartDay:Day = firstDayOfTheYear.day

        var date = Date(firstDayOfTheYear.getTime() - (((yearStartDay.ordinal - rowStartDay.ordinal) % 6) * 24 * 60 * 60 * 1000))

        for(y in 0 until height) {
            val rowDate = Date(date.getTime())

            for(box in 0 until boxesPerDay) {
                val row = document.createElement("tr") as HTMLTableRowElement

                date = rowDate

                for (x in 0 until width) {
                    val cell = document.createElement("td") as HTMLTableCellElement
                    val content = document.createElement("div") as HTMLDivElement

                    if(box == 0) {
                        if (date.getDate() == 1) {
                            content.innerHTML = "<h2>${RomanNumeral.value(date.getMonth() + 1)}</h2>"
                        }

                        content.innerHTML += "${date.getDate()}"
                    }
                    else
                        cell.classList.add("box")

                    cell.appendChild(content)

                    if (date.getFullYear() != year)
                        cell.classList.add("wrongYear")

                    cell.classList.add(date.day.toString().toLowerCase())

                    if (date.getDate() == 1)
                        cell.classList.add("monthStart")

                    row.appendChild(cell)

                    date = date.nextDay()
                }

                table.appendChild(row)
            }
        }

        return table
    }
}

val Date.day : Day
    get() = Day.values()[this.getDay()]

fun Date.nextDay() = Date(this.getTime() + 24 * 60 * 60 * 1000)
