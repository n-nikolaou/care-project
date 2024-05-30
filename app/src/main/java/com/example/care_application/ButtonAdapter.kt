import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

import com.example.care_application.*

class ButtonAdapter(private val buttonList: List<String>, private val listener: OnButtonClickListener) : RecyclerView.Adapter<ButtonAdapter.ButtonViewHolder>() {

    interface OnButtonClickListener {
        fun onButtonClick(position: Int)
    }

    class ButtonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.item_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_button, parent, false)
        return ButtonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ButtonViewHolder, position: Int) {
        holder.button.text = buttonList[position]
        holder.button.setOnClickListener {
            listener.onButtonClick(position)
        }
    }

    override fun getItemCount() = buttonList.size
}