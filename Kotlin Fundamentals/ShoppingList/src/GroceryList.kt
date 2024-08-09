class GroceryList(month :String, category: String, listID: Int): ShoppingList(listID){
    var category: String = ""
    var month :String = ""
    init{
        this.month=month
        this.category=category
    }
    override fun showAllItems(){
        super.showAllItems()
        println(" 'check for $month discounts'")
    }
}
