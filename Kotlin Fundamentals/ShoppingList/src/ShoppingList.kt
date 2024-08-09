open class ShoppingList(var listID : Int){
    //attributes
    var listName :String? = ""
    var itemsList = mutableListOf<Item> ()
    //methods
    fun nameYourList(){
        println("what would you name your list")
        listName = readln()
    }
    fun addItem(item: Item) = itemsList.add(item)
    fun removeItem(item: Item) = itemsList.remove(item)
    fun clearList() = itemsList.clear()
    open fun showAllItems() {
        if (itemsList.isEmpty()) {
            println("Your shopping list is empty!")
        } else {
            println("Your shopping list '$listName' includes:")
            itemsList.forEach { println(it) }
        }
    }
}