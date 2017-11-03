package todo.zeng.com.todo.data

import java.util.*

/**
 * description:Data：2017/11/3-17:55
 * @author admin
 *
 */
data class Task constructor(
        val title: String,
        val description: String,
        val uuid: String = UUID.randomUUID().toString()

) {
    var isCompleted = false
    val titleForList: String
        get() = if (title.isNotEmpty()) title else description

    val isActive
        get() = !isCompleted

    val isEmpty
        get() = title.isEmpty() && description.isNotEmpty()
}