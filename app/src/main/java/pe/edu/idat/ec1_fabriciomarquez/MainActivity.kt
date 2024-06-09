package pe.edu.idat.ec1_fabriciomarquez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.ec1_fabriciomarquez.ui.theme.EC1_FabricioMarquezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC1_FabricioMarquezTheme {



            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC1_FabricioMarquezTheme {
    }
}