package com.github.bespalovdn.asteriskscala.agi.command

import com.github.bespalovdn.asteriskscala.agi.handler.AgiCommandSender
import com.github.bespalovdn.asteriskscala.agi.response.AgiResponse

import scala.concurrent.Future

trait AgiCommand
{
    def send()(implicit sender: AgiCommandSender): Future[AgiResponse]
}