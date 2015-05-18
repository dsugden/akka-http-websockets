# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64_oraclejava8"

  config.vm.synced_folder ".", "/vagrant"
  config.vm.provider "virtualbox" do |v|
      v.memory = 2048
  end

  if Vagrant.has_plugin?("vagrant-cachier")
    config.cache.scope = :box
    config.cache.enable :apt
  end


 config.vm.define "nginx" do |nginx|
  nginx.vm.network "private_network", ip: "192.168.87.30"
  #nginx.vm.network "forwarded_port", guest: 9001, host: 9001
  nginx.vm.provision "ansible" do |ansible|
    ansible.playbook = "ansible/nginx.yml"
    ansible.sudo = true
    ansible.verbose = "vv"
  end
  end


  (1..2).each do |i|
     config.vm.define "member_#{i}" do |member|
        member.vm.network "private_network", ip: "192.168.87.3#{i}"
   #     member.vm.network "forwarded_port", guest: 9001, host: 9001
        member.vm.provision "ansible" do |ansible|
         ansible.extra_vars = {
           appIp: "192.168.87.3#{i}"
         }
         ansible.playbook = "ansible/member.yml"
         end
      end
  end

end
