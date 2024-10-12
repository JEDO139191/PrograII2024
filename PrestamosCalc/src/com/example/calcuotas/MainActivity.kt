package com.example.calcuotas

import java.lang.reflect.Modifier

class MainActivity : ComponentActivity {
    override fun Oncreate(savedIntanceState:Bundle?){
        super.onCreate(savedIntanceState)
        enableEdgetoEdge()
        setContent{
            CalcoutasTheme{
                Scaffold (modifier = modifier.fillMaxSize()){ innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name:String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}