package todo.zeng.com.todo.tasks

import todo.zeng.com.todo.BasePresenter
import todo.zeng.com.todo.BaseView

/**
 * description:Data：2017/11/3-17:31
 * @author admin
 *
 */
interface TasksContract {
    interface View : BaseView<Presenter> {}
    interface Presenter : BasePresenter {}
}