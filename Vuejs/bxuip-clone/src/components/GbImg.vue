<template>
    <div class="gb-img" :style="{ width: width }" @mouseover="mouseOver" @mouseleave="mouseLeave">
        <img class="image" :src="src" :style="{ width: width, height: height }">
        <div v-if="isHover">
            <button v-if="hasBtnText" class="btnText" :style="{ left: btnLeft, top: btnTop }">{{btnText}}</button>
            <p v-if="hasCaption" class="caption" :style="{ left: capLeft, top: capTop }">{{caption}}</p>
        </div>
        <p>{{desc}}</p>
    </div>
</template>

<script>
export default {
    props: {
        src: String,
        width: String,
        height: String,
        desc: String,
        btnText: String,
        caption: String
    },
    data: function() {
        return {
            hasBtnText: false,
            hasCaption: false,
            isHover: false
        };
    },
    computed: {
        btnLeft: function() {
            return String(parseInt(this.width)/2-50) + "px";
        },
        btnTop: function() {
            return String(parseInt(this.height)/2+30) + "px";
        },
        capLeft: function() {
            return String(parseInt(this.width)/2-50) + "px";
        },
        capTop: function() {
            return String(parseInt(this.height)/2-15) + "px";
        }
    },
    methods: {
        mouseOver: function(event) {
            if(event.target.className === "image") {
                this.isHover = true;
                event.target.style = "filter: brightness(50%); background-color: rgba(0, 0, 0, 0.5);";
            }
        },
        mouseLeave: function(event) {
            this.isHover = false;
            event.target.children[0].style = "filter: brightness(100%); background-color: rgba(0, 0, 0, 0);";
        }
    },
    created() {
        if(this.btnText !== undefined)
            this.hasBtnText = true;
        if(this.caption !== undefined)
            this.hasCaption = true;
    }
}
</script>

<style scoped>
    .gb-img {
        position: relative;
    }
    .btnText {
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
        width: 100px;
        line-height: 30px;
        height: 30px;
        border-style: solid;
        border-width: 1px;
        text-align: center;
        cursor: pointer;
        font-size: 12px;
        border-color: #fff;
        color: #fff;
        background: transparent;
        position: absolute;
    }
    .btnText:hover {
        border-color: #fff;
        color: #000;
        background: #fff;
    }
    .caption {
        width: 100px;
        height: 30px;
        text-align: center;
        color: #fff;
        position: absolute;
    }
</style>