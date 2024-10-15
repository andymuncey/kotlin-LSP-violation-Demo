class Square(side: Int) : Rectangle(side,side) {

    override var width: Int = super.width
        get() = field
        set(value) {
            field = value
            if (height != value) {
                height = value
            }
        }

    override var height: Int = super.height
        get() = field
        set(value) {
            field = value
            if (width != value){
                width = value
            }
        }


    fun setSide(side: Int){
        height = side
        width = side
    }


}