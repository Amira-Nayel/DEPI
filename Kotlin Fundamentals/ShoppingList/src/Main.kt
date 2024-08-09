fun main(args: Array<String>) {
    var skinCareList = ShoppingList(41)
    skinCareList.listName="Skin Care"
    var sunBlock = Item("Sun Block",2)
    var shampoo = Item("Shampoo",1)
    var hairMask = Item("Hair Mask",2)
    var snacksList = GroceryList("August", "Snacks",44)
    snacksList.listName = "Snacks List"
    var chips = Item("Chips",5)
    var popcorn = Item("Popcorn",5)
    var crackers = Item("crackers",2)

    snacksList.addItem(chips)
    snacksList.addItem(popcorn)
    snacksList.addItem(crackers)
    skinCareList.addItem(sunBlock)
    skinCareList.addItem(shampoo)
    skinCareList.addItem(hairMask)
    skinCareList.showAllItems()
    println()
    shampoo.markAsPurchased()
    for (i in skinCareList.itemsList) i.showPurchasedItem()
    println()
    snacksList.showAllItems()
}