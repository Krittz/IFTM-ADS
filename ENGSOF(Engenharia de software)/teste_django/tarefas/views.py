from django.shortcuts import render


def minha_visao(request):
    return render(request, "tarefas/index.html")
