This is the first git file
here is the update performed on the java file

cd /var/www/html/index.html
have to practise all the tags --skip_tags and how to run specifc tag
roles
-default
-meta - to initialize anything before role get start
-var
-tasks
-handlers
-templates

ansible_valut for maintaining secret passwords and how to invoke the dynamic inventory
nd connect to ec2 instance and get the hostnames and install tomcat in all the instances.

---
- hosts: all
  become:yes
  gather_facts: true
  remote_user: root
  tasks:
   - name: "createing the user and proving the password authentication and nopassword in /etc/sshd/*conf file)"
     user:

