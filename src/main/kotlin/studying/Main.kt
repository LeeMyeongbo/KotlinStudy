package studying

fun main() {
    val product:Product = createProduct()
    printInfo(product)
    raisePrice(product)
    printInfo(product)              // 매번 같은 객체를 참조하여 메모리 읽을 수 있음! -> 메모리 효율성 ↑
}

fun createProduct():Product {
    val banana = Product()
    banana.name = "박나나"
    banana.price = 5050

    return banana
}

fun raisePrice(product:Product) {
    product.price += 500
}

fun printInfo(product:Product) {
    println("이름 : ${product.name}")
    println("가격 : ${product.price}")
}