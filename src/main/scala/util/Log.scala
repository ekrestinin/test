package util

import org.slf4j.LoggerFactory

trait Log {
  protected val log = LoggerFactory.getLogger(this.getClass.getName)
}
