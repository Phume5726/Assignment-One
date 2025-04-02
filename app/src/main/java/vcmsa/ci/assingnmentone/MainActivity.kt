package vcmsa.ci.assingnmentone

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here
        val btnFood = findViewById<Button>(R.id.btnFood)
        val edtDay = findViewById<EditText>(R.id.edtDay)
        val txtSuggestions = findViewById<TextView>(R.id.txtSuggetions)
        val btnRestart = findViewById<Button>(R.id.btnRestart)

        btnRestart.setOnClickListener {
            edtDay.text.clear()
            txtSuggestions.text = ""
}
        btnFood.setOnClickListener {
            val day = edtDay.text.toString().trim()
            txtSuggestions.text = when (day.lowercase()) {
                "morning" -> "Breakfast: Pancakes, Oatmeal, Yogurt, Fruits"
                "afternoon" -> "Lunch: Grilled Chicken, Avocado Toast, Salad"
                "evening" -> "Dinner: Steak, Pasta, Salad"
                "mid-morning" -> "Mid-Morning: Fruit, Nuts, Vegetables"
                else -> "Invalid Input"
            }.toString()


        }



    }

}