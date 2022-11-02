class Gstrings{
 

static void main(String[] args){

        def string1 = "Esto es válido en Java y Groovy"
        def string2 = 'Esto es válido solo en Groovy'

        println string1.class
        println string2.class

        println(string1)
        println(string2)

        def saldo = 1821.14
        
        println "El saldo es de ${saldo} euros"

        def multilinea = """
        Primera linea
        Segunda linea
        Tercera linea con "comillas dobles" y 'comillas simples'
        """
        println multilinea
        
    }
}