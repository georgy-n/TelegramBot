package user_handler
import poll_store._
case class User(name: String) {
  def getPollToView: String = {
    if (PollsStore.userWorkWithPoll.contains(this)) {
      PollsStore.userWorkWithPoll(this).toString
    }
    else{
      "fail on try view poll"
    }
  }
}