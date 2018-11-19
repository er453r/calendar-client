@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package jspdf

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface `T$0` {
    fun getContext(): Any
    var style: Any
}
external interface `T$1` {
    var pageWrapXEnabled: Boolean
    var pageWrapYEnabled: Boolean
    var pageWrapX: Number
    var pageWrapY: Number
    fun f2(number: Number): Number
    fun fillRect(x: Number, y: Number, w: Number, h: Number)
    fun strokeRect(x: Number, y: Number, w: Number, h: Number)
    fun clearRect(x: Number, y: Number, w: Number, h: Number)
    fun save()
    fun restore()
    fun beginPath()
    fun closePath()
    fun setFillStyle(style: String)
    fun setStrokeStyle(style: String)
    fun fillText(text: String, x: Number, y: Number, maxWidth: Number)
    fun fillText(text: Array<String>, x: Number, y: Number, maxWidth: Number)
    fun strokeText(text: String, x: Number, y: Number, maxWidth: Number)
    fun strokeText(text: Array<String>, x: Number, y: Number, maxWidth: Number)
    fun setFont(font: String)
    fun setTextBaseline(baseline: String)
    fun getTextBaseline(): String
    fun setLineWidth(width: Number)
    fun setLineCap(style: String)
    fun setLineJoin(style: String)
    fun moveTo(x: Number, y: Number)
    var lastBreak: Number
    var pageBreaks: Array<Any>
    fun lineTo(x: Number, y: Number)
    fun bezierCurveTo(x1: Number, y1: Number, x2: Number, y2: Number, x: Number, y: Number)
    fun quadraticCurveTo(x1: Number, y1: Number, x: Number, y: Number)
    fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Any)
    fun drawImage(img: String, x: Number, y: Number, w: Number, h: Number, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, w2: Number? = definedExternally /* null */, h2: Number? = definedExternally /* null */)
    fun stroke()
    fun fill()
    fun translate(x: Number, y: Number)
    fun measureText(text: String): Number
}
@JsModule("jspdf")
external open class jsPDF(orientation: Any? = definedExternally /* null */, unit: String? = definedExternally /* null */, format: String? = definedExternally /* null */, compressPdf: Number? = definedExternally /* null */) {
    open var CapJoinStyles: Any = definedExternally
    open var version: String = definedExternally
    open var internal: Any = definedExternally
    open fun addPage(format: String? = definedExternally /* null */, orientation: String? /* "p" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: String? = definedExternally /* null */, orientation: String? /* "portrait" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: String? = definedExternally /* null */, orientation: String? /* "l" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: String? = definedExternally /* null */, orientation: String? /* "landscape" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: Array<Number>? = definedExternally /* null */, orientation: String? /* "p" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: Array<Number>? = definedExternally /* null */, orientation: String? /* "portrait" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: Array<Number>? = definedExternally /* null */, orientation: String? /* "l" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun addPage(format: Array<Number>? = definedExternally /* null */, orientation: String? /* "landscape" */ = definedExternally /* null */): jsPDF = definedExternally
    open fun setPage(n: Number): jsPDF = definedExternally
    open fun insertPage(beforePage: Number): jsPDF = definedExternally
    open fun movePage(targetPage: Number, beforePage: Number): jsPDF = definedExternally
    open fun deletePage(n: Number): jsPDF = definedExternally
    open fun setDisplayMode(zoom: String? = definedExternally /* null */, layout: String? = definedExternally /* null */, pmode: String? = definedExternally /* null */): jsPDF = definedExternally
    open fun text(text: Any, x: Any, y: Any, flags: Any? = definedExternally /* null */, angle: Any? = definedExternally /* null */, align: Any? = definedExternally /* null */): jsPDF = definedExternally
    open fun lstext(text: String, x: Number, y: Number, spacing: Number): jsPDF = definedExternally
    open fun line(x1: Number, y1: Number, x2: Number, y2: Number): Any = definedExternally
    open fun clip(): Unit = definedExternally
    open fun lines(lines: Any, x: Any, y: Any, scale: Any? = definedExternally /* null */, style: String? = definedExternally /* null */, closed: Boolean? = definedExternally /* null */): jsPDF = definedExternally
    open fun rect(x: Number, y: Number, w: Number, h: Number, style: String? = definedExternally /* null */): jsPDF = definedExternally
    open fun triangle(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, style: String): jsPDF = definedExternally
    open fun roundedRect(x: Number, y: Number, w: Number, h: Number, rx: Number, ry: Number, style: String): jsPDF = definedExternally
    open fun ellipse(x: Number, y: Number, rx: Number, ry: Number, style: String? = definedExternally /* null */): jsPDF = definedExternally
    open fun circle(x: Number, y: Number, r: Number, style: String): jsPDF = definedExternally
    open fun setProperties(properties: Any): jsPDF = definedExternally
    open fun setFontSize(size: Number): jsPDF = definedExternally
    open fun setFont(fontName: String? = definedExternally /* null */, fontStyle: String? = definedExternally /* null */): jsPDF = definedExternally
    open fun setFontStyle(style: String): jsPDF = definedExternally
    open fun setFontType(style: String): jsPDF = definedExternally
    open fun getFontList(): Any = definedExternally
    open fun addFont(postScriptName: String, fontName: String, fontStyle: String): String = definedExternally
    open fun setLineWidth(width: Number): jsPDF = definedExternally
    open fun setDrawColor(ch1: String, ch2: Number? = definedExternally /* null */, ch3: Number? = definedExternally /* null */, ch4: Number? = definedExternally /* null */): jsPDF = definedExternally
    open fun setDrawColor(ch1: Number, ch2: Number? = definedExternally /* null */, ch3: Number? = definedExternally /* null */, ch4: Number? = definedExternally /* null */): jsPDF = definedExternally
    open fun setFillColor(ch1: String, ch2: Number? = definedExternally /* null */, ch3: Number? = definedExternally /* null */, ch4: Number? = definedExternally /* null */): jsPDF = definedExternally
    open fun setFillColor(ch1: Number, ch2: Number? = definedExternally /* null */, ch3: Number? = definedExternally /* null */, ch4: Number? = definedExternally /* null */): jsPDF = definedExternally
    open fun setTextColor(r: Number? = definedExternally /* null */, g: Number? = definedExternally /* null */, b: Number? = definedExternally /* null */): jsPDF = definedExternally
    open fun setLineCap(style: String): jsPDF = definedExternally
    open fun setLineCap(style: Number): jsPDF = definedExternally
    open fun setLineJoin(style: String): jsPDF = definedExternally
    open fun setLineJoin(style: Number): jsPDF = definedExternally
    open fun output(type: String? = definedExternally /* null */, options: Any? = definedExternally /* null */): Any = definedExternally
    open fun save(filename: String): jsPDF = definedExternally
    open fun addHTML(element: Any, x: Number, y: Number, options: Any, callback: Function<*>): jsPDF = definedExternally
    open fun addHTML(element: Any, callback: Function<*>): jsPDF = definedExternally
    open var color_spaces: Any = definedExternally
    open var decode: Any = definedExternally
    open var image_compression: Any = definedExternally
    open fun sHashCode(str: String): Any = definedExternally
    open fun isString(`object`: Any): Boolean = definedExternally
    open fun extractInfoFromBase64DataURI(dataURI: String): Array<Any> = definedExternally
    open fun supportsArrayBuffer(): Boolean = definedExternally
    open fun isArrayBuffer(`object`: Any): Boolean = definedExternally
    open fun isArrayBufferView(`object`: Any): Boolean = definedExternally
    open fun binaryStringToUint8Array(binary_string: String): Uint8Array = definedExternally
    open fun arrayBufferToBinaryString(buffer: Any): String = definedExternally
    open fun arrayBufferToBase64(arrayBuffer: ArrayBuffer): String = definedExternally
    open fun createImageInfo(data: Any, wd: Any, ht: Any, cs: Any, bpc: Any, imageIndex: Number, alias: Any, f: Any? = definedExternally /* null */, dp: Any? = definedExternally /* null */, trns: Any? = definedExternally /* null */, pal: Any? = definedExternally /* null */, smask: Any? = definedExternally /* null */): Any = definedExternally
    open fun addImage(imageData: Any? = definedExternally /* null */, format: Any? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */, h: Number? = definedExternally /* null */, alias: Any? = definedExternally /* null */, compression: Any? = definedExternally /* null */, rotation: Any? = definedExternally /* null */): jsPDF = definedExternally
    open fun processJPEG(data: Any, index: Number, alias: Any, compression: Any? = definedExternally /* null */, dataAsBinaryString: String? = definedExternally /* null */): Any = definedExternally
    open fun processJPG(): Any = definedExternally
    open var annotationPlugin: Any = definedExternally
    open fun createAnnotation(options: Any): Unit = definedExternally
    open fun link(x: Number, y: Number, w: Number, h: Number, options: Any): Unit = definedExternally
    open fun textWithLink(text: String, x: Number, y: Number, options: Any): Number = definedExternally
    open fun getTextWidth(text: String): Number = definedExternally
    open fun getLineHeight(): Number = definedExternally
    open fun autoPrint(): jsPDF = definedExternally
    open var canvas: `T$0` = definedExternally
    open fun setHeaderFunction(func: Function<*>): Unit = definedExternally
    open fun getTextDimensions(txt: String): Any = definedExternally
    open fun cellAddPage(): Unit = definedExternally
    open fun cellInitialize(): Unit = definedExternally
    open fun cell(x: Number, y: Number, w: Number, h: Number, txt: String, ln: Number, align: String): jsPDF = definedExternally
    open fun arrayMax(array: Array<Any>, comparisonFn: Function<*>? = definedExternally /* null */): Number = definedExternally
    open fun table(x: Number, y: Number, data: Any, headers: Array<String>, config: Any): jsPDF = definedExternally
    open fun calculateLineHeight(headerNames: Array<String>, columnWidths: Array<Number>, model: Array<Any>): Number = definedExternally
    open fun setTableHeaderRow(config: Array<Any>): Unit = definedExternally
    open fun printHeaderRow(lineNumber: Number, new_page: Boolean? = definedExternally /* null */): Unit = definedExternally
    open var context2d: `T$1` = definedExternally
    open fun fromHTML(HTML: String, x: Number, y: Number, settings: Any? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, margins: Any? = definedExternally /* null */): jsPDF = definedExternally
    open fun fromHTML(HTML: HTMLElement, x: Number, y: Number, settings: Any? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, margins: Any? = definedExternally /* null */): jsPDF = definedExternally
    open fun addJS(txt: String): jsPDF = definedExternally
    open fun processPNG(imageData: Any, imageIndex: Number, alias: String, compression: Any, dataAsBinaryString: String): Any = definedExternally
    open fun getCharWidthsArray(text: String, options: Any? = definedExternally /* null */): Array<Any> = definedExternally
    open fun getStringUnitWidth(text: String, options: Any? = definedExternally /* null */): Number = definedExternally
    open fun splitTextToSize(text: String, maxlen: Number, options: Any? = definedExternally /* null */): Any = definedExternally
    open fun addSVG(svgtext: String, x: Number, y: Number, w: Number? = definedExternally /* null */, h: Number? = definedExternally /* null */): jsPDF = definedExternally
    open fun putTotalPages(pageExpression: String): jsPDF = definedExternally
    open fun addPage(): jsPDF = definedExternally
}
