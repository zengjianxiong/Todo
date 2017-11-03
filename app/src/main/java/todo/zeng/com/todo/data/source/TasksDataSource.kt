package todo.zeng.com.todo.data.source

import todo.zeng.com.todo.data.Task

/**
 * description:Data：2017/11/3-17:55
 * @author admin
 *
 */
interface TasksDataSource {
    interface LoadTasksCallback {

        fun onTasksLoaded(tasks: List<Task>)

        fun onDataNotAvailable()
    }

    interface GetTaskCallback {

        fun onTaskLoaded(task: Task)

        fun onDataNotAvailable()
    }
}