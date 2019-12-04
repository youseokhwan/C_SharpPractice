<template>
    <div class="gb-progress">
        <span v-if="hasLabel" class="label">{{label}}</span>
        <div class="bar">
            <div class="max"></div>
            <div class="value" :style="{ width: valuePercent, background: color }"></div>
        </div>
    </div>
</template>

<script>
export default {
    props: {
        label: String,
        value: String,
        max: String,
        color: String
    },
    data: function() {
        return {
            hasLabel: false
        };
    },
    computed: {
        valuePercent: function() {
            return String(Number(this.value)/Number(this.max) * 100) + "%";
        }
    },
    created() {
        if(this.label !== undefined) {
            this.hasLabel = true;
        }
    }
}
</script>

<style scoped>
    .gb-progress {
        width: 100%;
        height: 15px;
        margin-bottom: 10px;
    }
    .label {
        float: left;
        height: 15px;
        margin-left: 10px;
        margin-right: 20px;
        text-align: center;
        vertical-align: middle;
        text-transform: uppercase;
    }
    .bar {
        float: left;
        width: 75%;
        height: 15px;
        position: relative;
    }
    .max {
        width: 100%;
        height: 15px;
        background: #bebebe;
        position: absolute;
        border-radius: 30px 30px 30px 30px;
    }
    .value {
        height: 15px;
        background: #1297bf;
        position: absolute;
        border-radius: 30px 30px 30px 30px;
    }
</style>