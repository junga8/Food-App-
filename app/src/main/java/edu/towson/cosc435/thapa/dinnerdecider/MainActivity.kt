package edu.towson.cosc435.thapa.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//we don't have to do find by id non-scence
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Indian", "Pizza", "Chinese", "Nandos")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //whenever that button is clicked we gon listen and then do something
        saveBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodtext.text = foodList[randomFood]

        }

        //taking what's passed in out plain text field and convverting it into string then passing that to the array

        addFoodBtn.setOnClickListener {
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)
            //then we are clearing out the text field
            addFoodText.text.clear()
        }




    }
}