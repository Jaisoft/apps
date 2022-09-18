## Container

Add serve to package.json

```sh
cd container
npm install --save serve
```
Add a start scripts to [package.json]

```sh

{
  "scripts": {
    "start": "serve -s -l 4200"
  }
}
```
Add an [index.html] to container folder to configure the routing.

![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/route.png)

## Navbar
```sh
create-single-spa
```
![image info](https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/create.png)

## App1
```sh
create-single-spa
```
## App2

```sh
create-single-spa
```

[package.json]: <https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/container/package.json>
[index.html]: <https://github.com/Jaisoft/apps/blob/main/single-spa/sspa-poc/container/index.html>