<template>
    <div>
        <table>
            <tr>
                <td>id</td>
                <td>姓名</td>
                <td>性别</td>
            </tr>
            <tr v-for="item in users">
                <td>{{item.userid}}</td>
                <td>{{item.username}}</td>
                <td>{{item.usersex}}</td>
            </tr>
        </table>
    </div>
</template>

<script>
    export default {
        name: "UserInfo",
        data(){
            return {
                users:[
                    {
                        userid:"1",
                        username:'张三',
                        usersex:'男'
                    },
                    {
                        userid:"2",
                        username:'张四',
                        usersex:'女'
                    }
                ]
            }
        },
        created() {
            const _this = this;
            axios.get('http://localhost:8001/user/findAll').then(function (resp) {
                _this.users = resp.data
            })
        }
    }
</script>

<style scoped>

</style>