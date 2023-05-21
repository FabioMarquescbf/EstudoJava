/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apache;

/**
 *
 * @author fabio
 */
public class Operadores {
    
    /*              Precedência do operador
     Operadores         |  Precedência
     Postfix            |  expr++ expr--
     Unário             |  ++expr --expr +expr -expr ~ !
     multiplicativo     |     * / %
     aditivo            |  + -
     turno              |  << >> >>>
     relacional         | < > <= >= instanceof
     igualdade          | == !=
     bitwise E          | &
     exclusivo bitwise  | OR          ^
     bitwise inclusive  | OU          |
     lógico E           | &&
     lógica OU          | ||
     Ternário           | ? :
     designação         | = += -= *= /= %= &= ^= |= <<= >>= >>>=
    */
    
    
    //OPERADORES DE ATRIBUIÇÃO, ARITMÉTICA E UNÁRIA
    /*
        [Aritméticos]
        +   |   Operador aditivo (também usado para concatenação de string)
        -   |	Operador de subtração
        *   |	Operador de multiplicação
        /   | 	Operador de divisão
        %   |	Operador restante
        
    
        [Unários]
        +    |    Operador Unary plus; Indica valor positivo (os números são positivo sem isso, no entanto)
        -    |    Operador unário menos; Nega uma expressão
        ++   |    Operador de incremento; Incrementos um valor por 1
        --   | 	  Operador de decrement; Diminui um valor por 1
        !    |	  Operador de complemento lógico; inverte o valor de um booleano
    
    */
    
    /* 
        ATRIBUIÇÕE COMPOSTAS:
        Public static void main(String[] args){
            String firstString = "This is";
            String secondString = " a concatenated string.";
            String thirdString = firstString+secondString;
            System.out.println(thirdString);
        
        }
    */
    
    
    
/*
    
        Operador de atribuição simples
    =       Simple assignment operator
    
    Operadores aritméticos
    +       Additive operator (also used
            for String concatenation)
    -       Subtraction operator
    *       Multiplication operator
    /       Division operator
    %       Remainder operator
    
    Operadores Unários
    +       Unary plus operator; indicates
            positive value (numbers are 
            positive without this, however)
    -       Unary minus operator; negates
            an expression
    ++      Increment operator; increments
            a value by 1
    --      Decrement operator; decrements
            a value by 1
    !       Logical complement operator;
            inverts the value of a boolean
    
    Igualdade e Operadores Relacionais
    ==      Equal to
    !=      Not equal to
    >       Greater than
    >=      Greater than or equal to
    <       Less than
    <=      Less than or equal to
    
    Operadores condicionais
    &&      Conditional-AND
    ||      Conditional-OR
    ?:      Ternary (shorthand for 
            if-then-else statement)
    
    Operador de comparação de tipos
    instanceof      Compares an object to 
                    a specified type 
    
    Operadores Bitwise e Bit Shift
    ~       Unary bitwise complement
    <<      Signed left shift
    >>      Signed right shift
    >>>     Unsigned right shift
    &       Bitwise AND
    ^       Bitwise exclusive OR
    |       Bitwise inclusive OR
    
*/








    
}
// OPERADORES ARITMÉTICOS
class ArithmeticDemo {

    public static void main (String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
    }
}

//OPERADORES UNÁRIOS
class UnaryDemo {

    public static void main(String[] args) {

        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}

class PrePost { 
    public static void main(String[] args){
        int i = 3;
        i++;
        //4
        System.out.println(i);
        i++;
        // 5
        System.out.println(i);
        //6
        System.out.println(++i); // primeiro soma +1 a (i) para depois exibilo. 
        // 6
        System.out.println(i++); // primeiro exibi (i) depois encrementa +1 a (i).
        // 7
        System.out.println(i);
    }
}


// IGUALDE RELACIONAIS E CONDICIONAIS

class Comparacao { 

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
 
    }
}

class Condicionais {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) ||  (value2== 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}

class Condicao {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2; // se someCondition for igual a true printaeste : se não printaeste.

        System.out.println(result);
    }
}















