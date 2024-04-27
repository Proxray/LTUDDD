package tuan4

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.ListView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.example.myapplication.R
import org.json.JSONObject

class T4VolleyLv {
    fun getAllData(context: Context, listView: ListView) {
        val url = "https://hungnttg.github.io/array_json_new.json"
        val dataList = ArrayList<String>()

        // Tạo request
        val request = JsonArrayRequest(
            url,
            { response ->
                // Xử lý phản hồi thành công từ server
                for (i in 0 until response.length()) {
                    val person: JSONObject = response.getJSONObject(i)
                    val id = person.getString("id")
                    val name = person.getString("name")
                    val email = person.getString("email")
                    val address = person.getString("address")

                    // Tạo chuỗi hiển thị thông tin
                    val personInfo = "Id: $id\nName: $name\nEmail: $email\nAddress: $address\n"
                    dataList.add(personInfo)
                }

                // Tạo Adapter
                val adapter = ArrayAdapter(context, R.layout.t4_item_view, dataList)

                // Thiết lập Adapter cho ListView
                listView.adapter = adapter
            },
            { error ->
                // Xử lý khi có lỗi xảy ra trong quá trình request

            }
        )

        // Thêm request vào hàng đợi của Volley để thực hiện
        Volley.newRequestQueue(context).add(request)
    }
}