from django.urls import path
from .views import minha_visao

urlpatterns = [
    path('', minha_visao, name='minha_visao'),
]
