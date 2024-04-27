package tuan3
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class T3Adapter(val ls: ArrayList<T3contact>, val context: Context   ): BaseAdapter() {
    override fun getCount(): Int {
         return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, cvv: View?, parent: ViewGroup?): View {
        var cvv=cvv
        var vax:ViewAX
        if(cvv==null)
        {
            vax=ViewAX()
           cvv=LayoutInflater.from(context).inflate(R.layout.t3_item_view,null)
            vax.img_hinh=cvv!!.findViewById(R.id.t3ItemHinh)
            vax.tv_ten=cvv!!.findViewById(R.id.t3ItemTen)
            vax.tv_tuoi=cvv!!.findViewById(R.id.t3ItemTuoi)
            cvv.tag=vax
        }
        else{
            vax=cvv.tag as ViewAX
        }
        vax.img_hinh!!.setImageResource(ls[position].hinh)
        vax.tv_ten!!.text=ls[position].ten
        vax.tv_tuoi!!.text=ls[position].tuoi
        return cvv
    }
    internal inner class ViewAX{
        var img_hinh: ImageView? = null
        var tv_ten:TextView? = null
        var tv_tuoi:TextView? = null

    }

}