package com.sbsj.practicecoding.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserTable")
data class User(@PrimaryKey(autoGenerate = true)
                val id:Long,
                var name: String)

