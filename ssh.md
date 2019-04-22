1. 远程执行命令，ssh remote@x.x.x.x "df -h",显示磁盘情况
2. 执行多条命令，ssh remote@xxx.xxx.xxx.xxx "pwd; ls", 多条命令间一；区分
3. 执行需要交互的命令, -t 参数显式的告诉 ssh.需要一个 TTY 远程 shell 进行交互.
4. 交互式输入多条命令 使用 bash 指定了 -c 参数。
5. 远程执行脚本: ssh remote@xxx.xxx.xxx.xxx < test.sh
  给脚本传递参数: ssh remote@xxx.xxx.xxx.xxx 'bash -s' < test.sh
6. 执行远程服务器上的脚本:
   ssh remote@xxx.xxx.xxx.xxx "/home/admin/test.sh"
7. 远程执行脚本传参数
   ssh remote@xxx.xxx.xxx.xxx /home/admin/test.sh helloworld

