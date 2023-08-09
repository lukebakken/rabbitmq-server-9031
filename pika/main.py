# -*- coding: utf-8 -*-
# pylint: disable=C0111,C0103,R0205

import logging
import pika

logging.basicConfig(level=logging.DEBUG)

credentials = pika.PlainCredentials('admin', 'foobar')
parameters = pika.ConnectionParameters('localhost', credentials=credentials)
connection = pika.BlockingConnection(parameters)
connection.close()
