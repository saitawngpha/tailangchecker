package com.saitawngpha.tailangchecker

/*
* Tai or Shan Language Checker with regex.
* Author : Sai Tawng Pha
* 03/10/2023
 */

object TaiLangChecker {
    fun taiLangChecker(text: String): Boolean {
        //[b|f](?:ot|at) => matchs => true
        val regex = "([ၵ|ၶ|င|ၸ|သ|ၺ|တ|ထ|ၼ|ပ|ၽ|ၾ|မ|ယ|ရ|လ|ဝ|ႁ|ဢ](?:ႂ|ွ|ေ|ႄ|ိ|ီ|ဵ|ႅ|ႆ|ၢႆ|ု|ူ|ႃ|ၢ|ျ|ြ|ၵ်|င်|ၺ်|တ်|ၼ်|ပ်|မ်|ဝ်|်|ႇ|ႈ|း|ႉ|ႊ)*|\\s)*"
        return regex.toRegex().matches(text)
    }

    fun isNotTai(text: String): Boolean{
    val reg = "^(?![ၵ|ၶ|ၸ|ၺ|ၼ|ႁ|ဢ])(?=.*[က-အ](?<foo>ို|ိုး|ယ်|ြင်|ြိုင်|ြို|ြေ|ြ|ာ|ား|ိုင်ပင်|ည်|စ်|ဉ်|ေါ|ေါ်|ဲ|ေး|ှိ|သတိရ|ုန်|န်|ိုင်းပြသူ|ွား)(?!ၵ်|ၺ်|ၼ်)$).*"
    // println("isnottai: ${reg.toRegex().matches(text)}")
    return reg.toRegex().matches(text)
}
}
