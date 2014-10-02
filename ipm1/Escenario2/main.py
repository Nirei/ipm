#!/usr/bin/python
from model import *
from controller import *
from gi.repository import GObject

# Localhost server
#model = Model('http://localhost:5000')
# General server
model = Model('http://ipm-movie-database.herokuapp.com')
controller = Controller(model)

controller.start()