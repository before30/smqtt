package plantae.citrus.mqtt.packet

import scodec.Codec

case class FixedHeader(dup: Boolean = false, qos: Short = 0, retain: Boolean = false)

object FixedHeader {
  implicit val codec: Codec[FixedHeader] = fixedHeaderCodec
}

case class ConnectVariableHeader(
                                  userNameFlag: Boolean,
                                  passwordFlag: Boolean,
                                  willRetain: Boolean,
                                  willQoS: Short,
                                  willFlag: Boolean,
                                  cleanSession: Boolean,
                                  keepAliveTime: Int
                                )


object ConnectVariableHeader {
  implicit val codec: Codec[ConnectVariableHeader] = connectVariableHeaderCodec
}
