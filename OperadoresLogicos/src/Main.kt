fun main() {
    val n1:Int = 3
    val n2:Int = 9
    val n3:Int = 2
    val n4:Int = 5

    println("""-------------------------------
        Tabela do e
-------------------------------
    $n1 > $n3 e $n2 > $n4  ${n1 > n3 && n2 > n4}
    $n1 < $n3 e $n2 > $n4  ${n1 < n3 && n2 > n4}
    $n1 > $n3 e $n2 < $n4  ${n1 > n3 && n2 < n4}
    $n1 < $n3 e $n2 < $n4  ${n1 < n3 && n2 < n4}
-------------------------------""")

    println("""-------------------------------
        Tabela do ou
-------------------------------
    $n1 > $n3 ou $n2 > $n4  ${n1 > n3 || n2 > n4}
    $n1 < $n3 ou $n2 > $n4  ${n1 < n3 || n2 > n4}
    $n1 > $n3 ou $n2 < $n4  ${n1 > n3 || n2 < n4}
    $n1 < $n3 ou $n2 < $n4  ${n1 < n3 || n2 < n4}
-------------------------------""")

    print("""-------------------------------
        Tabela do não
-------------------------------
    Não $n1 > $n3 = ${!(n1 > n3)}
    Não $n1 < $n3 = ${!(n1 < n3)}
-------------------------------""")
}