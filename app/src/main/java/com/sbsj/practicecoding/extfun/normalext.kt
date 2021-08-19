package com.sbsj.practicecoding.extfun

import android.content.Context
import android.widget.TextView
import android.widget.Toast

fun Context.showToast() {
    var toast = Toast.makeText(this,"text",Toast.LENGTH_SHORT).show()

}
fun TextView.addText(add:String) {
    text = add
}