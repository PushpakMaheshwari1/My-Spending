package com.project.myspending

import androidx.annotation.Keep
import com.project.myspending.util.DateUtil
import java.io.Serializable
import java.util.*

/** A Data Table for our database
 *@param id : unique Id for Database
 *@param purpose : add purpose for spending
 *@param amount : add spent amount
 *@param date : date of spending
 **/
@Keep
data class Spending(
    var id: String = "",
    var purpose: String = "",
    var amount: Long = 0,
    var date: Date = DateUtil.getCurrentDate(),
) : Serializable
