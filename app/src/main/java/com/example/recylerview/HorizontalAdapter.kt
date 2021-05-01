import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recylerview.DetailsActivity
import com.example.recylerview.R

class HorizontalAdapter
    (
    private val activity: Activity

) :
    RecyclerView.Adapter<HorizontalAdapter.MyView>() {
    inner class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var item: CardView = view.findViewById<View>(R.id.item) as CardView

        init {
            item.setOnClickListener {
                activity.startActivity(Intent(activity, DetailsActivity::class.java))

            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyView {

        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.horizontal_item,
                parent,
                false
            )

        return MyView(itemView)
    }

    override fun onBindViewHolder(
        holder: MyView,
        position: Int
    ) {

//        holder.textView.text = list!![position]
    }


    override fun getItemCount(): Int = 10

}