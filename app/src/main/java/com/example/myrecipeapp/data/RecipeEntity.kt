package com.example.myrecipeapp.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.myrecipeapp.RecipeSearchAPI.BaseRecipe

@Entity(
    tableName = "recipes",
    indices = [Index(value = ["label"], unique = true)]
)
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true)
    val recipeId: Long = 0, // Set a default value for the autogenerated ID
    @Embedded val baseRecipe: BaseRecipe,
    val userId : String
    // Other specific properties for Room database
)