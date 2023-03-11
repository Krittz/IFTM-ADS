#!/bin/bash
#/home/iftm -> 192.168.21.33
case $1 in
         install)
                echo "Install Firewall"
		
                
        ;;

        start)
                echo "Start Firewall"

                
        ;;
        stop)
                echo "Stop Firewall"
                
        ;;
       	list)
                echo "List Firewall"
                
        ;;
        remover)
                echo "Remove Firewall"
                
        ;;
         *)
        echo "Opção inválida - Digite install, start, stop, list, remove"
        ;;

esac

