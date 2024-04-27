package tuan4

import android.content.Context
import android.widget.TextView
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class T4Volley {
    var strJSON = ""
    fun getAllData(context: Context, textView: TextView) {
        val queue = Volley.newRequestQueue(context)
        val url = "https://hungnttg.github.io/array_json_new.json"
        val request = JsonArrayRequest(url, { response ->
            for (i in 0 until response.length()) {
                val person = response.getJSONObject(i)
                val id = person.getString("id")
                val name = person.getString("name")
                val email = person.getString("email")
                val address = person.getString("address")
                strJSON += "Id: $id\n"
                strJSON += "Name $name\n"
                strJSON += "Email $email\n"
                strJSON += "Address $address\n"
            }
            textView.text = strJSON
        }, { error -> textView.text = error.message })
        queue.add(request)
    }
}