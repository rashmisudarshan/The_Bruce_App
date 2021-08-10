package com.example.thebruceapp.ui.notifications
import com.example.thebruceapp.R
class Datasource() {
    fun loadGallery(): List<Gallery> {
        return listOf<Gallery>(

            Gallery(R.string.Gallery1, R.drawable.image1),
            Gallery(R.string.Gallery2, R.drawable.image2),
            Gallery(R.string.Gallery3, R.drawable.image3),
            Gallery(R.string.Gallery4, R.drawable.image4),
            Gallery(R.string.Gallery5, R.drawable.image5),
            Gallery(R.string.Gallery6, R.drawable.image6),
            Gallery(R.string.Gallery7, R.drawable.image7),
            Gallery(R.string.Gallery8, R.drawable.image8),
            Gallery(R.string.Gallery9, R.drawable.image9),

            Gallery(R.string.Gallery10,R.drawable.image10),
            Gallery(R.string.Gallery11,R.drawable.image11),


            Gallery(R.string.Gallery12,R.drawable.image12),
            Gallery(R.string.Gallery13,R.drawable.image13),
            Gallery(R.string.Gallery14,R.drawable.image14),


            )
    }
}
