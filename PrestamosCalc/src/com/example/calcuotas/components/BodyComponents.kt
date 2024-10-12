package com.example.calcuotas.components

import java.lang.reflect.Modifier

@Composable
fun SpaceH (size: Dp=5.dp){
    Spacer(modifier=Modifier.height(size))
}

@Composable
fun SpaceV (size: Dp=5.dp){
    Spacer(modifier=Modifier.height(size))
}

@Composable
fun MainTextField(value: String, onValueChange: (String) -> Unit, label:String){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {Text(text=label)},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier
        .fillMaxWidth()
            .padding(horizontal = 30.dp)
    )
}
@Composable
fun MainButton (Text:String,
                onClick: () -> Unit,
                Color = MaterialTheme.colorScheme.primary){
    OutlinedButtons(
        onClick = onClick,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = color,
            contentColor = Color.Transparent),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
    ){
        Text(text=text)
    }
}
@Composable
fun Alert(title:String,
          message:String,
          confirmText:String,
          onConfirmClick: () -> Unit,
          onDismiss:()->Unit){
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {Text(text=title)},
        text = {Text(Text=message},
            confirmButton = {
                OutlinedButton(
                    onclick = onConfirmClick,
                    colors= ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorSchqueme.primary),
                    containerColor=Color.Transparent){
                    Text(text=confirmText)
                }

            }
    )
}