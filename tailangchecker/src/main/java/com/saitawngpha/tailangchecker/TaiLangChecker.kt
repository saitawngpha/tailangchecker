package com.saitawngpha.tailangchecker

/*
* Tai or Shan Language Checker with regex.
* Author : Sai Tawng Pha
* 25/08/2022
 */

object TaiLangChecker {
    fun taiLangChecker(text: String): Boolean {
        //[b|f](?:ot|at) => matchs => true
        val regex = "([ၵ|ၶ|င|ၸ|သ|ၺ|တ|ထ|ၼ|ပ|ၽ|ၾ|မ|ယ|ရ|လ|ဝ|ႁ|ဢ](?:ႂ|ွ|ေ|ႄ|ိ|ီ|ဵ|ႅ|ႆ|ၢႆ|ု|ူ|ႃ|ၢ|ျ|ြ|ၵ်|င်|ၺ်|တ်|ၼ်|ပ်|မ်|ဝ်|်|ႇ|ႈ|း|ႉ|ႊ)*|\\s)*"
        return regex.toRegex().matches(text)
    }
}