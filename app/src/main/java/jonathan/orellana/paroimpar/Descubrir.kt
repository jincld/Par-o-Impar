package jonathan.orellana.paroimpar

class Descubrir {

    fun descubrir(num1: Int):String{
        if (num1 % 2 == 0){
            return "El número $num1" + " Es par"
        }

        else{
            return "El número $num1" + " Es impar"
        }

    }
}