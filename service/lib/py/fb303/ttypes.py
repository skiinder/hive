#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

from thrift.Thrift import *

from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None


class fb_status:
  """
  Common status reporting mechanism across all services
  """
  DEAD = 0
  STARTING = 1
  ALIVE = 2
  STOPPING = 3
  STOPPED = 4
  WARNING = 5

