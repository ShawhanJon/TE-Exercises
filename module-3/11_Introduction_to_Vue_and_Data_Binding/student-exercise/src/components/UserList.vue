  
<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><input type="text" id="firstNameFilter" v-model="filter.firstName"/></td>
        <td><input type="text" id="lastNameFilter" v-model="filter.lastName"/></td>
        <td><input type="text" id="usernameFilter" v-model="filter.username"/></td>
        <td><input type="text" id="emailFilter" v-model="filter.emailAddress"/></td>
        <td>
          <select id="statusFilter" v-model="filter.status">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      <tr class="users" v-for="user in filteredList" v-bind:key="user.id" v-bind:class="{ disabled: user.status === 'Disabled'}">
        <td class="firstName">{{ user.firstName }}</td>
        <td class="lastName">{{ user.lastName }}</td>
        <td class="userName">{{ user.username }}</td>
        <td class="email">{{ user.emailAddress }}</td>
        <td class="status">{{ user.status }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: 'user-list',
  data() {
    return {
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Disabled' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Disabled' }
      ],
      filter: {
        firstName: '',
        lastName: '',
        username: '',
        emailAddress: '',
        status: '',
      }
    }
    
  },
  computed: {
    filteredList() {
      function isMatching(str1, str2) {
        return str1.toLowerCase().includes(str2.toLowerCase());
      } 
      return this.users.filter((user) => {
        return isMatching(user.firstName, this.filter.firstName) &&
          isMatching(user.lastName, this.filter.lastName) &&
          isMatching(user.username, this.filter.username) &&
          isMatching(user.emailAddress, this.filter.emailAddress) &&
          isMatching(user.status, this.filter.status);
      })
    }
  }
  
  
}
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>