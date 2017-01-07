import org.apache.commons.net.util.SubnetUtils

/**
  * Created by fscoward on 2017/01/06.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val targaetIP = "192.168.0.10"
    val subnet = "192.168.0.1/28"

    val subnetUtils = new SubnetUtils(subnet)
    val isInRange = subnetUtils.getInfo.isInRange(targaetIP)

    println(subnetUtils.getInfo)
    println(s"isInRange: ${isInRange}")
    println(s"${subnetUtils.getInfo.getAddress}")

    val isExists = subnetUtils.getInfo.getAddress == targaetIP || subnetUtils.getInfo.isInRange(targaetIP)

    println(s"isExists: $isExists")
  }
}
