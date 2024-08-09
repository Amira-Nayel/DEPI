class Item(itemName :String,quantity :Int){
    //attributes
    var itemName :String? = ""
    var purchased :Boolean = false
    var quantity :Int? = null
    //methods
    init{
        this.itemName = itemName
        this.quantity = quantity
    }
    fun markAsPurchased() {purchased=true}
    fun markAsNotPurchased(){purchased=false}
    fun showPurchasedItem(){
        if (purchased==true) {
            println("Items purchased : ")
            println("$itemName of quantity $quantity")
        }
    }
    override fun toString(): String {
        return "$itemName of Quantity $quantity"
    }
}
