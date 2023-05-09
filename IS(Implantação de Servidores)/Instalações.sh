#!/bin/bash
echo "Deseja realizar qual instalação?";
echo "1 - NetTools"
echo "2 - Lamp"
echo "3 - ProFTPD"
echo "4 - VsFTPD"
echo "5 - FileZilla"
echo "6 - Samba"
echo "7 - DHCP(isc-dhcp-server)"
echo "8 - Bind9(DNS)"
echo "0 - Encerrar script"
echo -n "Opção:"

while :
do



read opcao

case $opcao in

0) echo "Encerrando..."
        exit;;

1) echo "NetTools"
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install net-tools -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

2) echo "Lamp";;
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install apache2 mysql-server php libapache2-mod-php php-mysql -y
   echo "------------------------------//-------------------------------"
sleep 2
;;


3) echo "ProFTPD";;
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install proftpd -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

4) echo "VsFTPD"
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install vsftpd -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

5) echo "FileZilla"
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install filezilla -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

6) echo "Samba"
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install samba -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

7) echo "DHCP"
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install isc-dhcp-server -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

8) echo "Bind9"
   echo "------------------------------//-------------------------------"
sleep 1
sudo apt install bind9 -y
   echo "------------------------------//-------------------------------"
sleep 2
;;

*) echo "Opção inválida!";;

esac
        echo -n "Opção:"
done
